/**
 * Created by Administrator on 2016/6/27.
 */

$(document).ready(function(){

    $datatables = $('#datatable').dataTable($.extend(datatableParams,{
        sAjaxSource: $ctx+'geoTest',
        fnServerParams:function(aoData){
            aoData.push({"name":"name","value":$('#name').val()});
            aoData.push({"name":"parentType","value":$('#parentType').val()});
            aoData.push({"name":"parent","value":$('#parent').val()});
        },
        aoColumns:[{
            mData:'name',
            sClass:'text-left'
        },{
            mData:'year',
            sClass:'text-left',
        },{
            mData:"startdate",
            sClass:'text-center',
            mRender:function(data,display,record){
                return FormatDate(data);
            }
        },{
            mData:"endtdate",
            sClass:'text-center',
            mRender:function(data,display,record){
                return FormatDate(data);
            }
        },{
            mData:"status",
            sClass:'text-center',
            mRender:function(data,display,record){
                if(data=='Y'){
                    return '<span style="color:green">有效</span>';
                }else if(data=='N'){
                    return '<span style="color:red">无效</span>';
                }
                return '未知';
            }
        },{
            mData:"status",
            sClass:'text-center',
            mRender:function(data,display,record){
                var html='';
                if(data == 'Y'){
                    html+='<a class="cov resource_update" resourceid="'+record.id+'" pid="'+record.organizationid+'" href="javascript:void(0)">修改</a>';
                }
                return html;
            }
        }]
    }));





})

