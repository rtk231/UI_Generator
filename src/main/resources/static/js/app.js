$(document).ready(function() {
	tiggerAutoComplete();
	toggleVerifiedLink();
	tree();
	
	 $(function () {
          $("[class$='date']").datepicker();  
     });

	$("#location").geocomplete({
		details : ".geo-details",
		detailsAttribute : "data-geo",
		types : [ "geocode", "establishment" ],
	});

	$('[data-toggle="tooltip"]').tooltip({
		placement : 'bottom'
	});

	$('[data-toggle="dropdown"]').dropdown();
	
		
	$('#searchFilter').click(function(e){
		$('.collapse').find('input:text').val('');
		multiselect_deselectAll($('.collapse').find('[multiple="multiple"]'));
	    $('.collapse').find('select option:selected').removeAttr('selected');
	    $('#collapseFilter.collapse').toggle();
	});
	
	
	$('#propertyType').multiselect({		
		nonSelectedText:$(this).attr("data-placeholder"),
        includeSelectAllOption: true,
        selectAllValue: 'All'
    });
	
	$('#serviceType').multiselect({	
		enableFiltering: true,
        enableCaseInsensitiveFiltering: true
    });
	 
	 $('#myCarousel').carousel({
	      
	        interval:   6000
		});
		
		var clickEvent = false;
		$('#myCarousel').on('click', '.nav a', function() {
				clickEvent = true;
				$('.nav li').removeClass('active');
				$(this).parent().addClass('active');		
		}).on('slid.bs.carousel', function(e) {
			if(!clickEvent) {
				var count = $('.nav').children().length -1;
				var current = $('.nav li.active');
				current.removeClass('active').next().addClass('active');
				var id = parseInt(current.data('slide-to'));
				if(count == id) {
					$('.nav li').first().addClass('active');	
				}
			}
			clickEvent = false;
		});
	
});



function tiggerAutoComplete() {
	$("#cityStateZipString").geocomplete({
		types : [ '(regions)' ],
		details : ".search-geo-details",
		detailsAttribute : "data-geo",
	});
}

function multiselect_deselectAll($el) {
    $('option', $el).each(function(element) {
      $el.multiselect('deselect', $(this).val());
    });
  }

function tree(){
	$('.tree li:has(ul)').addClass('parent_li').find(' > span').attr('title', 'Collapse');
    $('.tree li.parent_li > span').on('click', function (e) {
        var children = $(this).parent('li.parent_li').find(' > ul > li');
        if (children.is(":visible")) {
            children.hide('fast');            
        } else {
            children.show('fast');          
        }
        e.stopPropagation();
    });
}

function toggleVerifiedLink(){
	$('.verified').click(function(){
		var propertyId= this.id;
		var title = $('#'+propertyId).attr('title');
		var url ='/verify/property/'+propertyId+'/'+title;
		
		
		$.ajax({
		  url: url,
		  success: function(){
			  if(title== 'Verify'){
				  $('#verifyicon').removeClass('fa-square-o');
				  $('#verifyicon').addClass('fa-check-square-o');
				  $('#'+propertyId).attr('title','Unverify');				  
			  }else{
				  $('#verifyicon').removeClass('fa-check-square-o');
				  $('#verifyicon').addClass('fa-square-o'); 
				  $('#'+propertyId).attr('title','Verify');				  
			  }
		  }
		});
	});
}