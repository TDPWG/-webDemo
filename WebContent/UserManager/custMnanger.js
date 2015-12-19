var gridObj=null;

$(function(){
	 gridObj = $.fn.bsgrid.init('custTable', {
         url: 'userManager_getCustInfoList.action',
         // autoLoad: false,
         pageSizeSelect: true,
         // pageAll: true,
         pageSize: 15
     });
});



function reset(){
	$("checkform").reset();
}

function doSearch(){
	gridObj.options.otherParames=$("checkform").serializeArray();
	 $.fn.bsgrid.refreshPage();
	
}