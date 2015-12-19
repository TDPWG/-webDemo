var  custTable=null;
var  empTable=null;


$(function() {
    $( "#tabs" ).tabs();
  });


var gridObj;
$(function () {
    // $.fn.bsgrid.defaults.pagingToolbarAlign = 'center'; // 默认值'right'

    // 重写锁屏遮罩
    // $.fn.bsgrid.lockScreen = function (options, xhr) {
    //     console.log('Lock Screen!');
    // };
    // $.fn.bsgrid.unlockScreen = function (options, xhr, ts) {
    //     console.log('Unlock Screen!');
    // };

    $.fn.bsgrid.defaults.stripeRows = true;

    // 在渲染表格数据前执行的方法
    $.fn.bsgrid.defaults.additionalBeforeRenderGrid = function (parseSuccess, gridData, options) {
        console.log('[additional before render grid]   ' + 'parseSuccess=' + parseSuccess);
    };
    // 渲染行数据执行方法, 不论此行是否为空行(即无数据渲染), 在渲染单元格数据方法执行前执行
    $.fn.bsgrid.defaults.additionalRenderPerRow = function (record, rowIndex, trObj, options) {
        if (record != null) { // null record render blank row
            console.log('[additional render per row]      ' + 'ID=' + gridObj.getRecordIndexValue(record, 'ID') + ', rowIndex=' + rowIndex);
        }
    };
    // 在渲染表格数据后执行的方法
    $.fn.bsgrid.defaults.additionalAfterRenderGrid = function (parseSuccess, gridData, options) {
        console.log('[additional after render grid]   ' + 'parseSuccess=' + parseSuccess);
    };

    // 重新刷新方法
    $.fn.bsgrid.refreshPage = function (options) {
        console.log('rewrite refreshPage method');
        $.fn.bsgrid.page($.fn.bsgrid.getCurPage(options), options);
    };

    // 初始化
    gridObj = $.fn.bsgrid.init('searchTable', {
        url: '../jquery.bsgrid-all/examples/grid/data/json.jsp',
        // autoLoad: false,
        pageSizeSelect: true,
        // pageAll: true,
        pageSize: 5
    });
});

function operate(record, rowIndex, colIndex, options) {
    return '<a href="#" onclick="alert(\'ID=' + gridObj.getRecordIndexValue(record, 'ID') + ', rowIndex=' + rowIndex + ', colIndex=' + colIndex + '\');">Operate</a>';
}