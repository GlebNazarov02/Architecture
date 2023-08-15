
package dz1.InMemoryModel;

import java.util.ArrayList;
// import dz1.ModelElements.PoligonalModel;
// import dz1.ModelElements.Scene;
// import dz1.ModelElements.Flash;
// import dz1.ModelElements.Camera;


public class ModelStore implements IModelChangeObserver, IModelChanger {

    ArrayList<PoligonalModel> Models = new ArrayList<>();
    ArrayList<Scene> Scenes = new ArrayList<>();
    ArrayList<Flash> Flashes = new ArrayList<>();
    ArrayList<Camera> Cameras = new ArrayList<>();

    public Scene getScene(int n_scene) {

        return Scenes.get(n_scene);
    }

    @Override
    public void NotifyChange() {

    }

    @Override
    public void ApplyUpdateModel() { 

    }
    }
