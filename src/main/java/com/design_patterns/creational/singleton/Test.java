import com.design_patterns.creational.singleton.Something;

void main() {
        Something configuration = Something.getInstance();
        Something configuration1 = Something.getInstance();
        Something configuration2 = Something.getInstance();

        System.out.println(configuration.hashCode());
        System.out.println(configuration1.hashCode());
        System.out.println(configuration2.hashCode());
    }