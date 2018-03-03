$(function () {
    $("#Verify").click(function(){
        $(this).attr("src","Security/createVerificationCode?timestamp="+new Date().getTime());
    });
});
$("#codeinput").focus(function () {
    $("#msg").html("验证码区分大小写").css("color","red");
})
