package utez.edu.mx.agenda.control;

import utez.edu.mx.agenda.model.BeanPerson;
import utez.edu.mx.agenda.model.DaoPerson;

import java.util.List;

public class ServicePerson {
    public List<BeanPerson> list() {
        DaoPerson daoPerson = new DaoPerson();
        List <BeanPerson> list = daoPerson.list();
        return list;

    };
    public boolean save(BeanPerson beanPerson){
        DaoPerson daoPerson = new DaoPerson();
        return daoPerson.save(beanPerson);
    }
    public static BeanPerson getPerson(int id){
        DaoPerson daoPerson = new DaoPerson();
        return daoPerson.get(id);
    }
    public static boolean update(BeanPerson beanPerson){
        DaoPerson daoPerson = new DaoPerson();
        return daoPerson.update(beanPerson);
    }
    public static boolean delete(int id){
        DaoPerson daoPerson = new DaoPerson();
        return daoPerson.delete(id);
    }
}
