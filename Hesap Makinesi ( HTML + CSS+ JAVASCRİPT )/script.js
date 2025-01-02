let runninTotal = 0;  //Yapılan işlemleri biriktirir
let buffer = "0";     //Kullanıcının ekrana girdiği değeri ifade eder
let previousOperator; //Matematiksel işlemleri saklar

const screen = document.querySelector('.screen'); //Hesap makinesinde ekranın gösterildiği alanı ifade eder

function buttonClick(value){ //Kullanıcı ekrana tıkladığında çağırılır
    if(isNaN(value)){        //Value tıklanan düğmenin değerini ifade eder
        handleSymbol(value);
    } else {
        handleNumber(value);
    }
    screen.innerText = buffer;
}

function handleSymbol(symbol){
    switch(symbol){
        case 'C':  //Tüm değerleri sıfırlar
            buffer = '0';
            runninTotal = 0;
            break;
        case '=':
            if(previousOperator === null){
                return;
            }
            flushOperation(parseInt(buffer));
            previousOperator = null;
            buffer = runninTotal;
            runninTotal = 0;
            break;
        case'←':    
        if(buffer.length === 1){
            buffer = '0';
        }else{
            buffer= buffer.toString(0, buffer.length - 1);
        }
        break;
    case '+':
    case '-':
    case '×':
    case '÷':
        handleMatch(symbol);
        break;
    }
    
}

function handleMatch(symbol){
    if(buffer === '0'){  //sayı sıfırda işlem yapmaz
        return;
    }
    const intBuffer = parseInt(buffer);

    if(runninTotal === 0){
        runninTotal = intBuffer;
    } else {
        flashOperation(intBuffer);
    }
    previousOperator = symbol;
    buffer = '0';
}
function flushOperation(intBuffer){
    if(previousOperator === '+'){
        runninTotal += intBuffer;
    }else if(previousOperator === '-'){
        runninTotal -= intBuffer;
    }else if(previousOperator === '×'){
        runninTotal *= intBuffer;
    }else if(previousOperator === '÷'){
        runninTotal /= intBuffer;
    }
}

function handleNumber(numberString){
    if(buffer === "0"){
        buffer = numberString;
    } else {
        buffer +=numberString;
    }
}

function init(){
    document.querySelector('.calc-buttons').addEventListener('click', function(event){
buttonClick(event.target.innerText);
    

    })
}

init(); 
// Hesap makinesinin başlangıç ayarlarını yapar
// Hesap makinesinin tuşlarını dinler
