package POO.HerancaPolimorfismo.ProjetoConta;

/**
 * Essa classe eu fiz para manipular os dados inseridos pelo usuario na data
 * mas achei maneiras mais fáceis de resolver utilizando as bibliotecas nativas
 * do java. Deixei aqui para mostrar a lógica aplicada.
 */
public class Data {
    int dia;
    int mes;
    int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public boolean validaData() {

        if (ano >= 0) {

            if ((mes >= 1) && (mes <= 12)) {

                if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                    if (dia >= 1 && dia <= 31) {
                        return true;
                    } else {
                        return false;
                    }
                } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {

                    if (dia >= 1 && dia <= 30) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    if (ano % 4 != 0) {

                        if (dia >= 1 && dia <= 28) {
                            return true;
                        } else {
                            return false;
                        }
                    } else if (ano % 4 == 0) {

                        if (ano % 100 != 0) {

                            if (dia >= 1 && dia <= 29) {
                                return true;
                            } else {
                                return false;
                            }
                        } else {

                            if (ano % 400 == 0) {
                                return true;
                            } else {
                                return false;
                            }
                        }
                    }
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
}