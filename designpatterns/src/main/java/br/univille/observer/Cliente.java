package br.univille.observer;

public class Cliente {

    public static void main(String[] args) {
        //publicador
        var grupoFamilia = new Publisher();

        var Deivid = new ConcreteSubscriber();
        var Francisco = new ConcreteSubscriber();
        var Artur = new ConcreteSubscriber();
        
        //entrou no Grupo
        grupoFamilia.Subscriber(Deivid);
        grupoFamilia.Subscriber(Francisco);
        grupoFamilia.Subscriber(Artur);

        grupoFamilia.setMainState("Reunião do grupo");
        //botão enviar
        grupoFamilia.notifyAllSubscribers();

    }

}
