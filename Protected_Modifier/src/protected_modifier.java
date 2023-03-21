class protected_modifier {
    protected void display() {
        System.out.println("MD MAFUJUL HASAN");
        System.out.println("CSE1903018137");
    }
}

class modifier extends protected_modifier {
    public static void main(String[] args) {
    	protected_modifier student = new protected_modifier();
        student.display();
    }
}

