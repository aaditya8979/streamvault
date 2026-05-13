package cs;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import er.g;
import er.h;
import er.i;
import er.j;
import er.k;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;
import org.fourthline.cling.model.types.b;
import org.fourthline.cling.model.types.csv.CSV;
import org.fourthline.cling.model.types.csv.CSVString;
import org.fourthline.cling.support.model.BrowseFlag;

/* JADX INFO: compiled from: AbstractContentDirectoryService.java */
/* JADX INFO: loaded from: classes12.dex */
@g(serviceId = @h("ContentDirectory"), serviceType = @i(value = "ContentDirectory", version = 1))
@k({@j(datatype = TypedValues.Custom.S_STRING, name = "A_ARG_TYPE_ObjectID", sendEvents = false), @j(datatype = TypedValues.Custom.S_STRING, name = "A_ARG_TYPE_Result", sendEvents = false), @j(allowedValuesEnum = BrowseFlag.class, datatype = TypedValues.Custom.S_STRING, name = "A_ARG_TYPE_BrowseFlag", sendEvents = false), @j(datatype = TypedValues.Custom.S_STRING, name = "A_ARG_TYPE_Filter", sendEvents = false), @j(datatype = TypedValues.Custom.S_STRING, name = "A_ARG_TYPE_SortCriteria", sendEvents = false), @j(datatype = "ui4", name = "A_ARG_TYPE_Index", sendEvents = false), @j(datatype = "ui4", name = "A_ARG_TYPE_Count", sendEvents = false), @j(datatype = "ui4", name = "A_ARG_TYPE_UpdateID", sendEvents = false), @j(datatype = NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, name = "A_ARG_TYPE_URI", sendEvents = false), @j(datatype = TypedValues.Custom.S_STRING, name = "A_ARG_TYPE_SearchCriteria", sendEvents = false)})
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @j(sendEvents = false)
    public final CSV<String> f59432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @j(sendEvents = false)
    public final CSV<String> f59433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @j(defaultValue = "0", eventMaximumRateMilliseconds = 200, sendEvents = true)
    public b f59434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PropertyChangeSupport f59435d;

    public a() {
        this(new ArrayList(), new ArrayList(), null);
    }

    public a(List<String> list, List<String> list2, PropertyChangeSupport propertyChangeSupport) {
        this.f59434c = new b(0L);
        this.f59435d = propertyChangeSupport == null ? new PropertyChangeSupport(this) : propertyChangeSupport;
        CSVString cSVString = new CSVString();
        this.f59432a = cSVString;
        cSVString.addAll(list);
        CSVString cSVString2 = new CSVString();
        this.f59433b = cSVString2;
        cSVString2.addAll(list2);
    }
}
