import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;


public class Business {
    private final Set<Employee> employees = new HashSet<>();
    private final List<Project> projects = new ArrayList<>();

    public void addEmployee(final Employee employee) throws ExistsException {
        if (employees.contains(employee)) {
            throw new ExistsException("Employee already exists into the business.");
        }

        employees.add(employee);
    }

    public void addProject(final Project project) throws ExistsException {
        if (projects.contains(project)) {
            throw new ExistsException("Project already exists into the business.");
        }

        projects.add(project);
    }

    public Set<Employee> getEmployees() {
        return Collections.unmodifiableSet(employees);
    }

    public List<Project> getProjects() {
        return Collections.unmodifiableList(projects);
    }
}
