/**
 * Ini adalah class HigherOrderFunctionClass
 * @author Dedi Gunawan
 * date 10 Dec 2019
 */
package main.java.latHigherOrderFunction;

public class HigherOrderFunctionClass {

    public <T> IFactory<T> createFactory(IProducer<T> producer, IConfigurator<T> configurator) {
         return () -> {
            T instance = producer.produce();
            configurator.configure(instance);
            return instance;
         }
    }
}
