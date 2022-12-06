package pageConstants;

public class OpportunityPageConstants {

    public static final String OPP_NAME="//input[contains(@name,'Name')]";
    public static final String OPP_CLOSEDATE ="//input[contains(@name,'CloseDate')]";
    public static final String OPP_STAGE_COMBO ="//label[text()='Stage']/following-sibling::div/lightning-base-combobox";
   // public static final String OPP_STAGE ="//span[text()='+@STAGE+']";
    public static final String OPP_STAGE = "//lightning-base-combobox-item[contains(.,'Prospecting')]";


}
