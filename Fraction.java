import java.until.scanner;

class Fraction{
Scanner input = new Scanner(System.in);
int numarator;
int denominator;
int whole;

    Fraction(int numaratorVal, int denominatorVal){
        numarator = numaratorVal;
        denominator = denominatorVal;
    }

    Fraction(int wholeVal, int numaratorVal, int denominatorVal){
        whole = wholeVal;
        if ( wholeVal<0){
            numarator = -1* (Math.abs(wholeVal) * denominatorVal + numaratorVal);
        }else{
        numarator = wholeVal * denominatorVal+ numaratorVal;
        }
        denominator = denominatorVal;
    }

    Fraction(int wholeVal){
            whole = wholeVal;
            numarator = wholeVal;
            denominator = 1;
    }









  
}

