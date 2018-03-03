$(function(){
    alert("dddddddddd");
    $.ajax({
        url:"queryRenYuan.do" ,
        dataType:"json" ,

        success:function(list) {
            alert("ok");
            //清空原数据
            //alert(studentList) ;
            /*  $.each(list,function(index,stu){
                  var $tr = $("<tr align='center'>" +
                      "<td>"+(index+1)+"</td>" +
                      "<td>"+stu.name+"</td>" +
                      "<td>"+stu.sex+"</td>" +
                      "<td>"+stu.height+"</td>" +
                      "<td>"+stu.sjhm+"<td>"+

                      "</tr>") ;

                  $("#tbl").append($tr) ;*/

            $.each(list, function (index, stu) {
                var $tr = $("<tr align='center'>" +
                    "<td>" + (index + 1) + "</td>" +
                    "<td>" + stu.name + "</td>" +
                    "<td>" + stu.sex + "</td>" +
                    "<td>" + stu.height + "</td>" +
                    "<td>" + stu.sjhm + "<td>" +

                    "</tr>");

                $("#tbl").append($tr)
            });
        }
        });
});



