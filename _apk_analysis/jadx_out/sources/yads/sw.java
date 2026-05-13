package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class sw {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final rw f94957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ sw[] f94958e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f94959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f94960c;

    static {
        sw[] swVarArr = {new sw(0, "CONSENT_STRING", io.bidmachine.z3.IAB_CONSENT_STRING, "IABTCF_TCString"), new sw(1, "GDPR", io.bidmachine.z3.IAB_SUBJECT_TO_GDPR, "IABTCF_gdprApplies"), new sw(2, "CMP_PRESENT", "IABConsent_CMPPresent", "IABTCF_CmpSdkID"), new sw(3, "PURPOSE_CONSENTS", "IABConsent_ParsedPurposeConsents", "IABTCF_PurposeConsents"), new sw(4, "VENDOR_CONSENTS", "IABConsent_ParsedVendorConsents", "IABTCF_VendorConsents"), new sw(5, "ADDITIONAL_CONSENT", null, "IABTCF_AddtlConsent")};
        f94958e = swVarArr;
        kotlin.enums.a.a(swVarArr);
        f94957d = new rw();
    }

    public sw(int i10, String str, String str2, String str3) {
        this.f94959b = str2;
        this.f94960c = str3;
    }

    public static sw valueOf(String str) {
        return (sw) Enum.valueOf(sw.class, str);
    }

    public static sw[] values() {
        return (sw[]) f94958e.clone();
    }
}
