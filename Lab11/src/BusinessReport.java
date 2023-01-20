import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BusinessReport {
    public static Map<Disability, List<Employee>> getEmployeesOnSameDisability(Business business) {
        return business.getEmployees().stream()
                .collect(Collectors.groupingBy(Employee::getDisability));
    }

    public static long getNumberOfDifferentProjectsWorkedByCurrentFemaleEmployees(Business business) {
        return business.getEmployees().stream()
                .filter(x -> x.getGender() == Gender.FEMALE)
                .flatMap(x -> x.getProjects().stream())
                .distinct().count();
    }

    public static Map<Religion, Map<Gender, List<Employee>>> getEmployeesOnSameReligionAndGender(Business business) {
        return business.getEmployees().stream()
                .collect(Collectors.groupingBy(Employee::getReligion, Collectors.groupingBy(Employee::getGender)));
    }
}
