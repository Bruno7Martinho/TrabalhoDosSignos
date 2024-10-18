package trabalhodossignos;

import java.util.Calendar;
import java.util.Scanner;

public class TrabalhoDosSignos {

    public static void main(String[] args) {
        //importações
        Scanner ler = new Scanner(System.in);
        Calendar hoje = Calendar.getInstance();
        //definição de variáveis
        String nome, signo, genero, cor;
        int caracteres, sexo, diaNascimento, diaAtual, mesNascimento, mesAtual, anoNascimento, anoAtual, idade, numeroSorte, corSorte;
        diaAtual = hoje.get(Calendar.DATE);
        mesAtual = hoje.get(Calendar.MONTH);
        anoAtual = hoje.get(Calendar.YEAR);
        signo = " ";
        //definição da cor e número da sorte do cliente
        numeroSorte = (int) (1 + (Math.random() * 99));
        corSorte = (int) (1 + (Math.random() * 18));
        switch (corSorte) {
            case 1:
                cor = "azul";
                break;
            case 2:
                cor = "verde";
                break;
            case 3:
                cor = "amarelo";
                break;
            case 4:
                cor = "laranja";
                break;
            case 5:
                cor = "cinza";
                break;
            case 6:
                cor = "branco";
                break;
            case 7:
                cor = "bege";
                break;
            case 8:
                cor = "azul-marinho";
                break;
            case 9:
                cor = "marrom";
                break;
            case 10:
                cor = "rosa";
                break;
            case 11:
                cor = "dourado";
                break;
            case 12:
                cor = "roxo";
                break;
            case 13:
                cor = "verde-lima";
                break;
            case 14:
                cor = "verde-limão";
                break;
            case 15:
                cor = "terracota";
                break;
            case 16:
                cor = "ciano";
                break;
            case 17:
                cor = "violeta";
                break;
            default:
                cor = "azul-turquesa";
                break;
        }
        //entradas
        System.out.println("Qual o seu nome completo?");
        nome = ler.nextLine();
        caracteres = nome.length();
        //definição do gênero do cliente, para definir o substantivo usado na saída de dados
        if (caracteres > 8) {
            System.out.println("Qual o seu sexo? (1)Feminino / (2)Masculino");
            sexo = ler.nextInt();

            if (sexo == 1) {
                genero = "Sra.";
            } else {
                genero = "Sr.";
            }
            //definição do dia, mês, ano e signo do cliente
            System.out.println("Qual o ano que você nasceu? (de 1900 até " + anoAtual + ")");
            anoNascimento = ler.nextInt();
            if (anoNascimento >= 1900 && anoNascimento <= anoAtual) {

                System.out.println("Qual o mês em que você nasceu?(1)Janeiro / (2)Fevereiro / (3)Março / (4)Abril / (5)Maio / (6)Junho / (7)Julho / (8)Agosto / (9)Setembro / (10)Outubro / (11)Novembro / (12)Dezembro");
                mesNascimento = ler.nextInt();

                switch (mesNascimento) {
                    //saída referente ao mês de janeiro
                    case 1:
                        System.out.println("Qual o dia em que você nasceu?(de 1 à 31)");
                        diaNascimento = ler.nextInt();
                        if (diaNascimento >= 0 && diaNascimento <= 31) {

                            idade = anoAtual - anoNascimento;
                            if (mesNascimento > mesAtual || (mesNascimento == mesAtual && diaNascimento > diaAtual)) {
                                idade -= 1;
                            }

                            if (diaNascimento >= 21 && diaNascimento <= 31 && mesNascimento == 1 || diaNascimento >= 1 && diaNascimento <= 19 && mesNascimento == 2) {
                                signo = "Aquário";
                            } else {
                            }
                            if (diaNascimento >= 22 && diaNascimento <= 31 && mesNascimento == 12 || diaNascimento >= 1 && diaNascimento <= 20 && mesNascimento == 1) {
                                signo = "Capricórnio";
                            } else {
                            }

                            System.out.println(genero + nome + ", você nasceu em " + diaNascimento + "/" + mesNascimento + "/" + anoNascimento + ", é do signo " + signo + ". Você tem " + idade + " anos. Seu número da sorte é " + numeroSorte + " e sua cor é " + cor);

                        } else {
                            System.out.println("Janeiro não possui esse dia");
                        }
                        break;
                    //saída referente ao mês de fevereiro
                    case 2:
                        System.out.println("Qual o dia em que você nasceu?(de 1 à 28)");
                        diaNascimento = ler.nextInt();
                        if (diaNascimento >= 0 && diaNascimento <= 28) {

                            idade = anoAtual - anoNascimento;
                            if (mesNascimento > mesAtual || (mesNascimento == mesAtual && diaNascimento > diaAtual)) {
                                idade -= 1;
                            }

                            if (diaNascimento >= 20 && diaNascimento <= 28 && mesNascimento == 2 || diaNascimento >= 1 && diaNascimento <= 20 && mesNascimento == 3) {
                                signo = "Peixes";
                            } else {
                            }
                            if (diaNascimento >= 21 && diaNascimento <= 31 && mesNascimento == 1 || diaNascimento >= 1 && diaNascimento <= 19 && mesNascimento == 2) {
                                signo = "Aquário";
                            } else {
                            }
                            System.out.println(genero + nome + ", você nasceu em " + diaNascimento + "/" + mesNascimento + "/" + anoNascimento + ", é do signo " + signo + ". Você tem " + idade + " anos. Seu número da sorte é " + numeroSorte + " e sua cor é " + cor);

                        } else {
                            System.out.println("Fevereiro não possui esse dia");
                        }
                        break;
                    //saída referente ao mês de março
                    case 3:
                        System.out.println("Qual o dia em que você nasceu?(de 1 à 31)");
                        diaNascimento = ler.nextInt();
                        if (diaNascimento >= 0 && diaNascimento <= 31) {

                            idade = anoAtual - anoNascimento;
                            if (mesNascimento > mesAtual || (mesNascimento == mesAtual && diaNascimento > diaAtual)) {
                                idade -= 1;
                            }

                            if (diaNascimento >= 21 && diaNascimento <= 31 && mesNascimento == 3 || diaNascimento >= 1 && diaNascimento <= 20 && mesNascimento == 4) {
                                signo = "Aries";
                            } else {
                            }
                            if (diaNascimento >= 20 && diaNascimento <= 28 && mesNascimento == 2 || diaNascimento >= 1 && diaNascimento <= 20 && mesNascimento == 3) {
                                signo = "Peixes";
                            } else {
                            }
                            System.out.println(genero + nome + ", você nasceu em " + diaNascimento + "/" + mesNascimento + "/" + anoNascimento + ", é do signo " + signo + ". Você tem " + idade + " anos. Seu número da sorte é " + numeroSorte + " e sua cor é " + cor);

                        } else {
                            System.out.println("Março não possui esse dia");
                        }
                        break;
                    //saída referente ao mês de abril
                    case 4:
                        System.out.println("Qual o dia em que você nasceu?(de 1 à 30)");
                        diaNascimento = ler.nextInt();
                        if (diaNascimento >= 0 && diaNascimento <= 30) {

                            idade = anoAtual - anoNascimento;
                            if (mesNascimento > mesAtual || (mesNascimento == mesAtual && diaNascimento > diaAtual)) {
                                idade -= 1;
                            }

                            if (diaNascimento >= 21 && diaNascimento <= 30 && mesNascimento == 4 || diaNascimento >= 1 && diaNascimento <= 20 && mesNascimento == 5) {
                                signo = "Touro";
                            } else {
                            }
                            if (diaNascimento >= 21 && diaNascimento <= 31 && mesNascimento == 3 || diaNascimento >= 1 && diaNascimento <= 20 && mesNascimento == 4) {
                                signo = "Aries";
                            } else {
                            }
                            System.out.println(genero + nome + ", você nasceu em " + diaNascimento + "/" + mesNascimento + "/" + anoNascimento + ", é do signo " + signo + ". Você tem " + idade + " anos. Seu número da sorte é " + numeroSorte + " e sua cor é " + cor);

                        } else {
                            System.out.println("Abril não possui esse dia");
                        }
                        break;
                    //saída referente ao mês de maio
                    case 5:
                        System.out.println("Qual o dia em que você nasceu?(de 1 à 31)");
                        diaNascimento = ler.nextInt();
                        if (diaNascimento >= 0 && diaNascimento <= 31) {

                            idade = anoAtual - anoNascimento;
                            if (mesNascimento > mesAtual || (mesNascimento == mesAtual && diaNascimento > diaAtual)) {
                                idade -= 1;
                            }

                            if (diaNascimento >= 21 && diaNascimento <= 30 && mesNascimento == 5 || diaNascimento >= 1 && diaNascimento <= 20 && mesNascimento == 6) {
                                signo = "Gemêos";
                            } else {
                            }
                            if (diaNascimento >= 21 && diaNascimento <= 30 && mesNascimento == 4 || diaNascimento >= 1 && diaNascimento <= 20 && mesNascimento == 5) {
                                signo = "Touro";
                            } else {
                            }
                            System.out.println(genero + nome + ", você nasceu em " + diaNascimento + "/" + mesNascimento + "/" + anoNascimento + ", é do signo " + signo + ". Você tem " + idade + " anos. Seu número da sorte é " + numeroSorte + " e sua cor é " + cor);

                        } else {
                            System.out.println("Maio não possui esse dia");
                        }
                        break;
                    //saída referente ao mês de junho
                    case 6:
                        System.out.println("Qual o dia em que você nasceu?(de 1 à 30)");
                        diaNascimento = ler.nextInt();
                        if (diaNascimento >= 0 && diaNascimento <= 30) {

                            idade = anoAtual - anoNascimento;
                            if (mesNascimento > mesAtual || (mesNascimento == mesAtual && diaNascimento > diaAtual)) {
                                idade -= 1;
                            }

                            if (diaNascimento >= 21 && diaNascimento <= 31 && mesNascimento == 6 || diaNascimento >= 1 && diaNascimento <= 21 && mesNascimento == 7) {
                                signo = "Cancêr";
                            } else {
                            }
                            if (diaNascimento >= 21 && diaNascimento <= 30 && mesNascimento == 5 || diaNascimento >= 1 && diaNascimento <= 20 && mesNascimento == 6) {
                                signo = "Gemêos";
                            } else {
                            }
                            System.out.println(genero + nome + ", você nasceu em " + diaNascimento + "/" + mesNascimento + "/" + anoNascimento + ", é do signo " + signo + ". Você tem " + idade + " anos. Seu número da sorte é " + numeroSorte + " e sua cor é " + cor);

                        } else {
                            System.out.println("Junho não possui esse dia");
                        }
                        break;
                    //saída referente ao mês de julho
                    case 7:
                        System.out.println("Qual o dia em que você nasceu?(de 1 à 31)");
                        diaNascimento = ler.nextInt();
                        if (diaNascimento >= 0 && diaNascimento <= 31) {

                            idade = anoAtual - anoNascimento;
                            if (mesNascimento > mesAtual || (mesNascimento == mesAtual && diaNascimento > diaAtual)) {
                                idade -= 1;
                            }

                            if (diaNascimento >= 22 && diaNascimento <= 31 && mesNascimento == 7 || diaNascimento >= 1 && diaNascimento <= 22 && mesNascimento == 8) {
                                signo = "Leão";
                            } else {
                            }
                            if (diaNascimento >= 21 && diaNascimento <= 31 && mesNascimento == 6 || diaNascimento >= 1 && diaNascimento <= 21 && mesNascimento == 7) {
                                signo = "Cancêr";
                            } else {
                            }
                            //saída com resposta completa ao cliente referente ao mês de julho
                            System.out.println(genero + nome + ", você nasceu em " + diaNascimento + "/" + mesNascimento + "/" + anoNascimento + ", é do signo " + signo + ". Você tem " + idade + " anos. Seu número da sorte é " + numeroSorte + " e sua cor é " + cor);

                        } else {
                            System.out.println("Julho não possui esse dia");
                        }
                        break;
                    //saída referente ao mês de agosto
                    case 8:
                        System.out.println("Qual o dia em que você nasceu?(de 1 à 31)");
                        diaNascimento = ler.nextInt();
                        if (diaNascimento >= 0 && diaNascimento <= 31) {

                            idade = anoAtual - anoNascimento;
                            if (mesNascimento > mesAtual || (mesNascimento == mesAtual && diaNascimento > diaAtual)) {
                                idade -= 1;
                            }

                            if (diaNascimento >= 23 && diaNascimento <= 31 && mesNascimento == 8 || diaNascimento >= 1 && diaNascimento <= 22 && mesNascimento == 9) {
                                signo = "Virgem";
                            } else {
                            }
                            if (diaNascimento >= 22 && diaNascimento <= 31 && mesNascimento == 7 || diaNascimento >= 1 && diaNascimento <= 22 && mesNascimento == 8) {
                                signo = "Leão";
                            } else {
                            }
                            //saída com resposta completa ao cliente referente ao mês de agosto
                            System.out.println(genero + nome + ", você nasceu em " + diaNascimento + "/" + mesNascimento + "/" + anoNascimento + ", é do signo " + signo + ". Você tem " + idade + " anos. Seu número da sorte é " + numeroSorte + " e sua cor é " + cor);

                        } else {
                            System.out.println("Agosto não possui esse dia");
                        }
                        break;
                    //saída referente ao mês de setembro
                    case 9:
                        System.out.println("Qual o dia em que você nasceu?(de 1 à 30)");
                        diaNascimento = ler.nextInt();
                        if (diaNascimento >= 0 && diaNascimento <= 30) {
                            idade = anoAtual - anoNascimento;
                            if (mesNascimento > mesAtual || (mesNascimento == mesAtual && diaNascimento > diaAtual)) {
                                idade -= 1;
                            }

                            if (diaNascimento >= 23 && diaNascimento <= 31 && mesNascimento == 9 || diaNascimento >= 1 && diaNascimento <= 22 && mesNascimento == 10) {
                                signo = "Libra";
                            } else {
                            }
                            if (diaNascimento >= 23 && diaNascimento <= 31 && mesNascimento == 8 || diaNascimento >= 1 && diaNascimento <= 22 && mesNascimento == 9) {
                                signo = "Virgem";
                            } else {
                            }
                            //saída com resposta completa ao cliente referente ao mês de setembro
                            System.out.println(genero + nome + ", você nasceu em " + diaNascimento + "/" + mesNascimento + "/" + anoNascimento + ", é do signo " + signo + ". Você tem " + idade + " anos. Seu número da sorte é " + numeroSorte + " e sua cor é " + cor);

                        } else {
                            System.out.println("Setembro não possui esse dia");
                        }
                        break;
                    //saída referente ao mês de outubro
                    case 10:
                        System.out.println("Qual o dia em que você nasceu?(de 1 à 31)");
                        diaNascimento = ler.nextInt();
                        if (diaNascimento >= 0 && diaNascimento <= 31) {

                            idade = anoAtual - anoNascimento;
                            if (mesNascimento > mesAtual || (mesNascimento == mesAtual && diaNascimento > diaAtual)) {
                                idade -= 1;
                            }

                            if (diaNascimento >= 23 && diaNascimento <= 31 && mesNascimento == 10 || diaNascimento >= 1 && diaNascimento <= 21 && mesNascimento == 11) {
                                signo = "Escorpião";
                            } else {
                            }
                            if (diaNascimento >= 23 && diaNascimento <= 31 && mesNascimento == 9 || diaNascimento >= 1 && diaNascimento <= 22 && mesNascimento == 10) {
                                signo = "Libra";
                            } else {
                            }
                            //saída com resposta completa ao cliente referente ao mês de outubro
                            System.out.println(genero + nome + ", você nasceu em " + diaNascimento + "/" + mesNascimento + "/" + anoNascimento + ", é do signo " + signo + ". Você tem " + idade + " anos. Seu número da sorte é " + numeroSorte + " e sua cor é " + cor);

                        } else {
                            System.out.println("Outubro não possui esse dia");
                        }
                        break;
                    //saída referente ao mês de novembro
                    case 11:
                        System.out.println("Qual o dia em que você nasceu?(de 1 à 30)");
                        diaNascimento = ler.nextInt();
                        if (diaNascimento >= 0 && diaNascimento <= 30) {

                            idade = anoAtual - anoNascimento;
                            if (mesNascimento > mesAtual || (mesNascimento == mesAtual && diaNascimento > diaAtual)) {
                                idade -= 1;
                            }

                            if (diaNascimento >= 22 && diaNascimento <= 31 && mesNascimento == 11 || diaNascimento >= 1 && diaNascimento <= 21 && mesNascimento == 12) {
                                signo = "Sagitário";
                            } else {
                            }
                            if (diaNascimento >= 23 && diaNascimento <= 31 && mesNascimento == 10 || diaNascimento >= 1 && diaNascimento <= 21 && mesNascimento == 11) {
                                signo = "Escorpião";
                            } else {
                            }
                            //saída com resposta completa ao cliente referente ao mês de novembro
                            System.out.println(genero + nome + ", você nasceu em " + diaNascimento + "/" + mesNascimento + "/" + anoNascimento + ", é do signo " + signo + ". Você tem " + idade + " anos. Seu número da sorte é " + numeroSorte + " e sua cor é " + cor);

                        } else {
                            System.out.println("Novembro não possui esse dia");
                        }
                        break;
                    //definição de signo referente ao mês de dezembro
                    case 12:
                        System.out.println("Qual o dia em que você nasceu?(de 1 à 31)");
                        diaNascimento = ler.nextInt();
                        if (diaNascimento >= 0 && diaNascimento <= 31) {

                            idade = anoAtual - anoNascimento;
                            if (mesNascimento > mesAtual || (mesNascimento == mesAtual && diaNascimento > diaAtual)) {
                                idade -= 1;
                            }

                            if (diaNascimento >= 22 && diaNascimento <= 31 && mesNascimento == 12 || diaNascimento >= 1 && diaNascimento <= 20 && mesNascimento == 1) {
                                signo = "Capricórnio";
                            } else {
                            }
                            if (diaNascimento >= 22 && diaNascimento <= 31 && mesNascimento == 11 || diaNascimento >= 1 && diaNascimento <= 21 && mesNascimento == 12) {
                                signo = "Sagitário";
                            } else {
                            }
                            //saída com resposta completa ao cliente referente ao mês de dezembro
                            System.out.println(genero + nome + ", você nasceu em " + diaNascimento + "/" + mesNascimento + "/" + anoNascimento + ", é do signo " + signo + ". Você tem " + idade + " anos. Seu número da sorte é " + numeroSorte + " e sua cor é " + cor);

                        } else {
                            System.out.println("Dezembro não possui esse dia");
                        }
                        break;
                    default:
                        //utilização do default acaso cliente inserir um mês inexistente, informar que o mês informado não existe
                        System.out.println("Esse mês não existe!");
                        break;
                }
                //utilização de else acaso o cliente inserir o ano sem seguir regras do enunciado, enviar mensagem e encerrar entradas
            } else {
                System.out.println("Você inseriu o ano errado!");
            }
            //utilização de else acaso o cliente inserir o nome com menos de 8 caracteres, enviar mensagem e encerrar entradas
        } else {
            System.out.println("Seu nome completo tem que ter mais que 8 caracteres!");
        }

    }
}
