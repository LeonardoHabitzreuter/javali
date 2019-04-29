/* validator form cliente */
$(document).ready(function(){
  var validator = $("#formCliente").bootstrapValidator({
    feedbackIcons: {
      valid: "glyphicon glyphicon-ok",
      invalid: "glyphicon glyphicon-remove",
      validating: "glyphicon glyphicon-refresh"
    },
    fields : {
      nome :{
        validators :{
          notEmpty : {
            message: "Nome é obrigatório"
          },
          regexp : {
            regexp: /^[a-zà-úA-ZÀ-Ú]+$/i,
            message: "Por favor, somente letras"
          }
        }
      },
      cpf :{
          validators :{
            notEmpty : {
              message: "cpf é obrigatório"
            },
            regexp : {
              regexp: /^[a-zà-úA-ZÀ-Ú]+$/i,
              message: "Por favor, somente letras"
            }
          }
        },
      senha :{
        message : "senha é obrigatório",
        validators : {
          notEmpty : {
            message: "Por favor, forneça um senha"
          },
          stringLength: {
            min: 6,
            max: 35,
            message: "senha deve ter entre 6 e 35 caracteres"
          },

          senhaAddress: {
            message: "senha inválido"
          }
        }
      },
    }
  }).on("success.form.bv", function (e) {
		e.preventDefault();
	});
});

/* validator form atualizarCliente */
$(document).ready(function(){
  var validator = $("#formAtualizarCliente").bootstrapValidator({
    feedbackIcons: {
      valid: "glyphicon glyphicon-ok",
      invalid: "glyphicon glyphicon-remove",
      validating: "glyphicon glyphicon-refresh"
    },
    fields : {
      nome :{
        validators :{
          notEmpty : {
            message: "Nome é obrigatório"
          },
          regexp : {
            regexp: /^[a-zà-úA-ZÀ-Ú]+$/i,
            message: "Por favor, somente letras"
          }
        }
      },
      cpf :{
          validators :{
            notEmpty : {
              message: "cpf é obrigatório"
            },
            regexp : {
              regexp: /^[a-zà-úA-ZÀ-Ú]+$/i,
              message: "Por favor, somente letras"
            }
          }
        },
      senha :{
        message : "senha é obrigatório",
        validators : {
          notEmpty : {
            message: "Por favor, forneça um senha"
          },
          stringLength: {
            min: 6,
            max: 35,
            message: "senha deve ter entre 6 e 35 caracteres"
          },

          senhaAddress: {
            message: "senha inválido"
          }
        }
      },
    }
  }).on("success.form.bv", function (e) {
		e.preventDefault();
	});
});



