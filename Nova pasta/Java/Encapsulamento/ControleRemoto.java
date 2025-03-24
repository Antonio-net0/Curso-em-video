        package Encapsulamento;

        public class ControleRemoto implements Controlador {
            private int volume;
            private boolean ligado;
            private boolean tocando;

            private int getVolume() {
                return volume;
            }

            private void setVolume(int volume) {
                this.volume = volume;
            }

            private boolean isTocando() {
                return tocando;
            }

            private void setTocando(boolean tocando) {
                this.tocando = tocando;
            }

            private boolean isLigado() {
                return ligado;
            }

            private void setLigado(boolean ligado) {
                this.ligado = ligado;
            }

            public ControleRemoto() {
                this.setVolume(50);
                this.setLigado(true);
                this.setTocando(false);
            }


            @Override
            public void ligar() {
                this.setLigado(true);
            }

            @Override
            public void desligar() {
                this.setLigado(false);
            }

            @Override
            public void abrirMenu() {
                if (this.isLigado()) {
                    System.out.println(" Está ligado? " + this.isLigado());
                    System.out.println("Está tocando" + this.isTocando());
                    System.out.println("Volume: " + this.getVolume());
                    for (int i = 0; i <= this.getVolume(); i += 10) {
                        System.out.print("|");
                    }
                }
            }

            @Override
            public void fecharMenu() {
                if (isLigado()) {
                    System.out.println("                ");
                    System.out.println(" Fechando Menu ");
                }
            }

            @Override
            public void maisVolume() {
                if (this.isLigado()) {
                    this.setVolume(getVolume() + 5);
                } else {
                    System.out.println("TV está desligada!!!!");
                }
            }

            @Override
            public void menosVolume() {
                if (this.isLigado()) {
                    this.setVolume(getVolume() - 5);
                } else {
                    System.out.println("TV está desligada!!!!");
                }
            }

            @Override
            public void ligarMudo() {
                if (this.isLigado() && this.getVolume() > 0) {
                    this.setVolume(0);
                } else {
                    System.out.println("TV está desligada!!!!");
                }
            }

            @Override
            public void desligarMudo() {
                if (this.isLigado() && this.getVolume() == 0) {
                    this.setVolume(50);
                }
            }

            @Override
            public void play() {
                if (this.isLigado() && !this.isTocando()) {
                    this.setTocando(true);
                }
            }

            @Override
            public void pause() {
                if (this.isLigado() && this.isTocando()) {
                    this.setTocando(false);
                }
            }
        }

