package advanced.generics;

import java.util.List;

public class ProjectService implements Service<Project, Long>{
    //TODO: add attributes here
    //Logger logger
    //ProjectDao projectDao
    //...

    public List<Project> findAll(){
        //TODO: write your implementation here
        //return projectDao.findAll()
        return null;
    }

    public Project save(Project project){
        //TODO: write your implementation here
        //return projectDao.save(project)
        return null;
    }

    @Override
    public Project findById(Long id) {
        //TODO: write your implementation here
        //return projectDao.find(id)
        return null;
    }
}
