package edu.ucne.p1_reny.utils

fun isNumeric(a : String ) : Boolean{
    try{
        a.toDouble();
        return true;
    }catch(e : NumberFormatException){
        return false;
    }
}