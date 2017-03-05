package ServiceFrame;

/**
 * Created by MoJiMin on 2016/12/2.
 */
public class provider implements ServiceProvider{

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    private Pet pet;

    public provider(Pet pet){
        this.pet = pet;
    }

    @Override
    public Pet newInstance() {
        return pet;
    }
}
