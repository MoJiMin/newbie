package ServiceFrame;

import typeinfo.pets.*;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by MoJiMin on 2016/12/2.
 */
public class Services {
    private Services() {}

    private static final Map<String ,ServiceProvider> providers =
            new ConcurrentHashMap<String,ServiceProvider>();

    private static final String DEFAULT_PROVIDER_NAME = "<def>";

    public static void registerProvider(String name, ServiceProvider p){
        providers.put(name, p);
    }

    public static void registerDefualtProvider(ServiceProvider p){
        registerProvider(DEFAULT_PROVIDER_NAME,p);
    }

    public static Pet newInstance(){
        return newInstance(DEFAULT_PROVIDER_NAME);
    }

    public static Pet newInstance(String name){
        ServiceProvider p = providers.get(name);

        if (p==null)
            throw new IllegalArgumentException(
                    "NO provider registered with the name:" + name
            );
        return p.newInstance();
    }
}
