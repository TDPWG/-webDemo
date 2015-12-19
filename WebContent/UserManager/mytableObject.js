Table=function(id){
	this.id=id;
	this.target=$(id);
	this.pageSize=this.target.attr("pageSize");
	this.pageNum=1;
	this.searchCondition={};
	this.dataSource=this.target.attr("dataSource");

	this.dataRows=0;
	this.dataColumns=0;
	this.columnNames=getColumns(id);
	this.
}

Table.prototype.load=load;

function getColumns(id){
	if(id==null||$.trim(id)==''){
		return [];
	}
	var column=[];
	var tr;
	tr=$(id+" tr[name='title']").first();
	
	if(tr!=null&& tr!=undefined){
		var tds=$(tr).children();
		     $.each(tds,function(index){
				var name=$(this).attr('name');
				column.push(name);
		});
	}  
    return  column;
}

Table.prototype.getColumNames=getColumns;

function  load(url,condition){
	$.post(url);
}

function changeUi(id){
	 var pageSize=$("#pageSize").val();
	 var rows=$(id+" tr")-1;
	 
	 if(rows<pageSize){
		var trs= $(id+"tr");
		for(var i=0;i<trs.length;i++){
			if($(trs[i]).attr("name")=='title'){
				return i;
			}
		}
	  
		var len=trs.length-i-1;
		$("#page")
	 
	 }else if(rows>pageSize){
		 
	 }
	 

}