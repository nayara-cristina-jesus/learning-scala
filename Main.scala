/* Calculo do IMC

------------------------------------  
 IMC (kg/m²)  - Classificação
------------------------------------  
menor que 18,5 - Magreza
de 18,5 a 24,9 - Peso normal
de 25,0 a 29,9 - Sobrepeso
de 30,0 a 34,9 - Obesidade grau I
de 35,0 a 40,0 - Obesidade grau II
maior que 40,0 - Obesidade grau III */

object Main {
  // Calculando IMC
  def imc(peso:Double, altura:Double): Double = {
    (peso/altura)/2
  }
  //Classificando IMC
  def classifica(resultado:Double): String = {
    if (resultado < 18.5) {
      return "\nMagreza";
    } else if (resultado < 24.9) {
      return "\nPeso normal";
    } else if (resultado < 29.9) {
      return "\nSobrepeso";
    } else if (resultado < 34.9) {
      return "\nObesidade grau I";
    } else if (resultado < 40.0) {
      return "\nObesidade grau II";
    } else {
      return "\nObesidade grau III";
    }
  }

  def main(args: Array[String]): Unit = {
    // Saida de dados
    println("\nCalculo do IMC")
    println("\nIMC:" + imc (1.80, 70.0))
    println(classifica (60.0))
  }
}
