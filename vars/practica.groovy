def call (body){

    def params = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = params
    body()  

    pipeline{

        agent any

        stages{

            stage ('mensaje'){

                steps{

                    echo "practicando pipeline ${params.message}" 

                }
            }
                 stage ('enviar correo'){


                steps{

                    mail bcc: '', body: 'prueba de jenkins', cc: '', from: '', replyTo: '', subject: 'jenkins-capa', to: 'segundasexposiciones@gmail.com'
                
                }
                
            }
             

        }     
        
    }
}
