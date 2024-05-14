public class MyTestingClass {
    private int id;
    private String name;

    public MyTestingClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int hashCode(){
        if(name == null){
            throw new NullPointerException();
        }
        int hash = 7;
        hash = 31 * hash + id;
        hash = 31 * hash + name.hashCode();
        return hash;
    }

    public boolean equals(Object object){
        if(name == null){
            throw new NullPointerException();
        }
        if(this == object){
            return true;
        }
        if(object == null || getClass() != object.getClass()){
            return false;
        }
        MyTestingClass other = (MyTestingClass) object;
        return id == other.id && name.equals(other.name);
    }
}