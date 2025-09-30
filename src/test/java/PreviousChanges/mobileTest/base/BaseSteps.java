package PreviousChanges.mobileTest.base;

import java.lang.reflect.InvocationTargetException;
public class BaseSteps  {

    // Метод get реализует ленивую и потокобезопасную инициализацию
    protected static  <T extends BaseSteps> T get(ThreadLocal<T> stepsInstanceHolder, Class<T> clazz) {
        if (stepsInstanceHolder.get() == null) {
            try {
                T instance = clazz.getDeclaredConstructor().newInstance();
                stepsInstanceHolder.set(instance);
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
                throw new RuntimeException("Failed to create singleton instance for " + clazz.getName(), e);
            }
        }
        return stepsInstanceHolder.get();
    }
}
