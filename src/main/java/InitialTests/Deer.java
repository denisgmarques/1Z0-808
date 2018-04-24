package InitialTests;

class Deer {
    public Deer() {
        System.out.print("Deer Empty constructor");
    }

    public Deer(int age) {
        System.out.print("DeerAge");
    }

    private boolean hasHorns() {
        return false;
    }

    public static void main(String[] args) {
        Deer deer = new Reindeer(5); // PASSARÁ NO CONSTRUTOR VAZIO DA SUPERCLASSE DEER
                                     // DEPOIS NO CONSTRUTOR VAZIO DA SUPERCLASSE DEER2
                                     // ANTES DE PASSAR NO CONSTRUTOR Reindeer(int)
        System.out.println("," + deer.hasHorns());
    }
}

class Deer2 extends Deer {
    public Deer2() {
        System.out.print("Deer2 Empty constructor");
    }
    public Deer2(int age) {
        System.out.print("Reindeer");
    }

    public boolean hasHorns() {
        return true;
    }
}

class Reindeer extends Deer2 {
    public Reindeer() {
        System.out.print("Reindeer Empty constructor");
    }
    public Reindeer(int age) {
        System.out.print("Reindeer");
    }

    public boolean hasHorns() {
        return true;
    }
}