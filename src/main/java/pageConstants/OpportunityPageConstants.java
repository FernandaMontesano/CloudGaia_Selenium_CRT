package pageConstants;

public class OpportunityPageConstants {

    public static final String OPP_NAME = "//input[contains(@name,'Name')]";
    public static final String OPP_CURRENT_NAME = "(//lightning-formatted-text[contains(@slot,'primaryField')])[2]";
    public static final String OPP_CLOSEDATE = "//input[contains(@name,'CloseDate')]";
    public static final String OPP_STAGE_COMBO = "//label[text()='Stage']/following-sibling::div/lightning-base-combobox";
    public static final String OPP_STAGE = "//lightning-base-combobox-item[contains(.,'Prospecting')]";
    public static final String MARK_CURRENTSTG_BTN = "//span[contains(.,'Mark as Current Stage')]";
    public static final String MARK_CLOSESTG_BTN = "//span[contains(.,'Select Closed Stage')]";
    public static final String MARK_COMPLETE_BTN = "(//span[contains(.,'Mark Stage as Complete')])[2]";

    public static final String PROSPECTING_STG = "//span[@class='title slds-path__title'][contains(.,'Prospecting')]";
    public static final String QUALIFICATION_STG = "//a[@data-tab-name='Qualification'][contains(.,'Qualification')]";
    public static final String NEED_ANALYSIS_STG = "//span[@class='title slds-path__title'][contains(.,'Needs Analysis')]";
    public static final String VALUE_PROP_STG = "//span[@class='title slds-path__title'][contains(.,'Value Proposition')]";
    public static final String DECISION_MKS_STG = "//span[@class='title slds-path__title'][contains(.,'Id. Decision Makers')]";
    public static final String PERCEPTION_ANALYSIS_STG = "//span[@class='title slds-path__title'][contains(.,'Perception Analysis')]";
    public static final String PROPOSAL_QUOTE_STG = "//a[@data-tab-name='Proposal/Price Quote'][contains(.,'Proposal/Price Quote')]";
    public static final String NEGOCIATION_STG = "//span[@class='title slds-path__title'][contains(.,'Negotiation/Review')]";
    public static final String CLOSED_STG = "//span[@class='title slds-path__title'][contains(.,'Closed')]";

}
