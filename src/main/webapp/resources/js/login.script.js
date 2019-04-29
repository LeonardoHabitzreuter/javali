$(document).ready(function() {
	$("#formLogin").submit(function(e) {
        e.preventDefault()
		var cpf = $("#cpf").val();
		var senha = $("#senha").val();
			$.ajax({
				url : "login",
				type : "POST",
				dataType : "html",
				data : {
					cpf : cpf,
					senha : senha
				},
				success : function() {
                    
                },
                error : function(error) {
                    console.error(error)
                    //localStorage.setItem('user', dados.user)
				},
				statusCode : {
					200 : success
				}
			});
		return false;
	});
});

function success(dados) {
	console.log(dados)
    //localStorage.setItem('user', dados.user)
}
