import java.io.*;
public class DirMonitor{
	private Paths path = null;
	private WatchService watchService=null;
	private void init() {
		path=paths.get("./");
		try {
			watchService= fileSystem.getDefault().newWatchService();
            path.register(watchService,ENTRY_CREATE, ENTRY_DELETE, ENTRY_MODIFY);
		}
		catch(IOException e) {
			System.out.println("IOException ="+e.getMessage());
		}
	}
	private void doRounds() {
		WatchKey key =null;
		while(true) {
			try {
				key =watchKey.take();
				for(WatchEvent<?> event : key.pollEvents()) {
					Kind<?> kind = event.kind();
					System.out.println("Event on"+event.context().toString());

				}
			}
			catch(InterruptedException e){
				System.out.println("InterruptedException="+e.getMessage());
			}
			boolean reset =key.reset();
			if(!reset){
				break;
			}
		}
	}
}