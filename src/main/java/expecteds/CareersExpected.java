package expecteds;

import java.util.Arrays;
import java.util.List;

public class CareersExpected {

    public static List<String> DEFAULT_EXPECTED_TEAMS() {
        return Arrays.asList(
                "Customer Success", "Sales", "Product & Engineering"
        );
    }

    public static List<String> EXPECTED_TEAMS() {
        return Arrays.asList(
                "Customer Success", "Sales", "Product & Engineering", "Finance & Business Support",
                "Marketing", "CEO's Execute Office", "Purchasing & Operations", "People and Culture",
                "Business Intelligence", "Security Engineering", "Partnership", "Quality Assurance",
                "Mobile Business Unit", "Partner Support Development", "Product Design"
        );
    }

    public static final String EXPECTED_TITLE = "Career";
}