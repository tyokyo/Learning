package Observer.Mixin;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;


public abstract class ObservableSubjectMixin<ListenerType> {
	private List<ListenerType> listeners = new ArrayList<>();
	public ListenerType registerListener (ListenerType listener) {
		// Add the listener to the list of registered listeners
		this.listeners.add(listener);
		return listener;
	}
	public void unregisterAnimalAddedListener (ListenerType listener) {
		// Remove the listener from the list of the registered listeners
		this.listeners.remove(listener);
	}
	public void notifyListeners (Consumer<? super ListenerType> algorithm) {
		// Execute some function on each of the listeners
		this.listeners.forEach(algorithm);
	}
}