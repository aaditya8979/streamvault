package com.facebook.appevents;

import android.content.Context;
import android.util.Log;
import com.facebook.appevents.AccessTokenAppIdPair;
import com.facebook.appevents.AppEvent;
import com.facebook.internal.j0;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AppEventDiskStore.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u000b\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/facebook/appevents/d;", "", "Lcom/facebook/appevents/PersistedEvents;", "a", "eventsToPersist", "Lbn/r;", "b", "(Lcom/facebook/appevents/PersistedEvents;)V", "", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d f15193a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final String TAG = d.class.getName();

    /* JADX INFO: compiled from: AppEventDiskStore.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u0011\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\n"}, d2 = {"Lcom/facebook/appevents/d$a;", "Ljava/io/ObjectInputStream;", "Ljava/io/ObjectStreamClass;", "readClassDescriptor", "Ljava/io/InputStream;", "inputStream", "<init>", "(Ljava/io/InputStream;)V", "b", "a", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class a extends ObjectInputStream {
        public a(@Nullable InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.ObjectInputStream
        @NotNull
        public ObjectStreamClass readClassDescriptor() throws ClassNotFoundException, IOException {
            ObjectStreamClass classDescriptor = super.readClassDescriptor();
            if (tn.p.f(classDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) {
                classDescriptor = ObjectStreamClass.lookup(AccessTokenAppIdPair.SerializationProxyV1.class);
            } else if (tn.p.f(classDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV2")) {
                classDescriptor = ObjectStreamClass.lookup(AppEvent.SerializationProxyV2.class);
            }
            tn.p.j(classDescriptor, "resultClassDescriptor");
            return classDescriptor;
        }
    }

    @NotNull
    public static final synchronized PersistedEvents a() {
        PersistedEvents persistedEvents;
        Throwable th2;
        a aVar;
        String str;
        String str2;
        Object object;
        s2.g.b();
        Context contextL = k2.t.l();
        persistedEvents = null;
        try {
            try {
                FileInputStream fileInputStreamOpenFileInput = contextL.openFileInput("AppEventsLogger.persistedevents");
                tn.p.j(fileInputStreamOpenFileInput, "context.openFileInput(PERSISTED_EVENTS_FILENAME)");
                aVar = new a(new BufferedInputStream(fileInputStreamOpenFileInput));
                try {
                    object = aVar.readObject();
                } catch (FileNotFoundException unused) {
                    j0.j(aVar);
                    try {
                        contextL.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                    } catch (Exception e10) {
                        e = e10;
                        str = TAG;
                        str2 = "Got unexpected exception when removing events file: ";
                        Log.w(str, str2, e);
                    }
                } catch (Exception e11) {
                    e = e11;
                    Log.w(TAG, "Got unexpected exception while reading events: ", e);
                    j0.j(aVar);
                    try {
                        contextL.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                    } catch (Exception e12) {
                        e = e12;
                        str = TAG;
                        str2 = "Got unexpected exception when removing events file: ";
                        Log.w(str, str2, e);
                    }
                }
            } catch (Throwable th3) {
                th2 = th3;
                j0.j(null);
                try {
                    contextL.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                } catch (Exception e13) {
                    Log.w(TAG, "Got unexpected exception when removing events file: ", e13);
                }
                throw th2;
            }
        } catch (FileNotFoundException unused2) {
            aVar = null;
        } catch (Exception e14) {
            e = e14;
            aVar = null;
        } catch (Throwable th4) {
            th2 = th4;
            j0.j(null);
            contextL.getFileStreamPath("AppEventsLogger.persistedevents").delete();
            throw th2;
        }
        if (object == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.PersistedEvents");
        }
        PersistedEvents persistedEvents2 = (PersistedEvents) object;
        j0.j(aVar);
        try {
            contextL.getFileStreamPath("AppEventsLogger.persistedevents").delete();
        } catch (Exception e15) {
            Log.w(TAG, "Got unexpected exception when removing events file: ", e15);
        }
        persistedEvents = persistedEvents2;
        if (persistedEvents == null) {
            persistedEvents = new PersistedEvents();
        }
        return persistedEvents;
    }

    public static final void b(@Nullable PersistedEvents eventsToPersist) {
        ObjectOutputStream objectOutputStream;
        Context contextL = k2.t.l();
        ObjectOutputStream objectOutputStream2 = null;
        try {
            objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(contextL.openFileOutput("AppEventsLogger.persistedevents", 0)));
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            objectOutputStream.writeObject(eventsToPersist);
            j0.j(objectOutputStream);
        } catch (Throwable th3) {
            th = th3;
            objectOutputStream2 = objectOutputStream;
            try {
                Log.w(TAG, "Got unexpected exception while persisting events: ", th);
                try {
                    contextL.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                } catch (Exception unused) {
                }
            } finally {
                j0.j(objectOutputStream2);
            }
        }
    }
}
