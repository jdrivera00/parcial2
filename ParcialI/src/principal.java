public class principal {

    public static void main(String[] args) {

        serie listaSeries[]=new serie[5];
        videojuego listaVideojuegos[]=new videojuego[5];
        
        listaSeries[0]=new serie();
        listaSeries[1]=new serie("Juego de tronos", 8 ,"Aventura");
        listaSeries[2]=new serie("Los Simpsons", 25, "Humor");
        listaSeries[3]=new serie("La casa de papel", 7 ,"Accion");
        listaSeries[4]=new serie("Breaking Bad", 5, "Thriller");

        listaVideojuegos[0]=new videojuego();
        listaVideojuegos[1]=new videojuego("FIFA 22", 30, "Deportes", "EA");
        listaVideojuegos[2]=new videojuego("Call of duty modern warfare", 25 , "Accion" , "Activision");
        listaVideojuegos[3]=new videojuego("Super Mario", 30, "Plataforma", "Nintendo");
        listaVideojuegos[4]=new videojuego("Rainbow Six Siege", 200, "Accion", "Square Enix");

        listaSeries[1].entregar();
        listaSeries[4].entregar();

        listaVideojuegos[0].entregar();
        listaVideojuegos[3].entregar();

        int entregados=0;
        for(int i=0;i<listaSeries.length;i++){

            if(listaSeries[i].isEntregado()){
                entregados+=1;
                listaSeries[i].devolver();
            }

            if(listaVideojuegos[i].isEntregado()){
                entregados+=1;
                listaVideojuegos[i].devolver();
            }
        }

        System.out.println("Hay "+entregados+" articulos entregados");

        serie serieMayor=listaSeries[0];
        videojuego videojuegoMayor=listaVideojuegos[0];

        for(int i=1;i<listaSeries.length;i++){
            if(listaSeries[i].compareTo(serieMayor)==serie.MAYOR){
                serieMayor=listaSeries[i];
            }

            if(listaVideojuegos[i].compareTo(videojuegoMayor)==videojuego.MAYOR){
                videojuegoMayor=listaVideojuegos[i];
            }
        }

        System.out.println(videojuegoMayor);
        System.out.println(serieMayor);
    }
}