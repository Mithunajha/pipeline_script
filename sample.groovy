pipeline {
    agent any
    parameters {
        string(name: 'Name', defaultValue:'Mithunajha', description:'Enter Name')
        string(name: 'Roll_No',defaultValue:'20CSR',description:'Enter Your Roll No')
        choice(name: 'Section', choices: ['A','B','C','D'],description:'Enter Section')
        booleanParam(name: 'Placement_Willingness', defaultValue: True,description:'Are you willing in placement side?')
        choice(name: 'Area_Of_Interest', choices: ['Coding','Designing','Others'],description:'Enter Your Area Of Interest')
    }
    stages {
        stage('Hello') {
            steps {
                echo "Hello ${params.Name} and Your Roll No is ${params.Roll_No} from ${params.Section}"
                echo "Hope Your Area of Interest is ${params.Area_Of_Interest} and Your willingness is ${params.Placement_Willingness}"
            }
        }
    }
}
