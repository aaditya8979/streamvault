package uo;

import java.util.Iterator;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: SerialDescriptor.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class h {

    /* JADX INFO: compiled from: SerialDescriptor.kt */
    public static final class a implements Iterator<SerialDescriptor>, un.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f85765b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SerialDescriptor f85766c;

        public a(SerialDescriptor serialDescriptor) {
            this.f85766c = serialDescriptor;
            this.f85765b = serialDescriptor.e();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SerialDescriptor next() {
            SerialDescriptor serialDescriptor = this.f85766c;
            int iE = serialDescriptor.e();
            int i10 = this.f85765b;
            this.f85765b = i10 - 1;
            return serialDescriptor.d(iE - i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f85765b > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: compiled from: SerialDescriptor.kt */
    public static final class b implements Iterator<String>, un.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f85767b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SerialDescriptor f85768c;

        public b(SerialDescriptor serialDescriptor) {
            this.f85768c = serialDescriptor;
            this.f85767b = serialDescriptor.e();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            SerialDescriptor serialDescriptor = this.f85768c;
            int iE = serialDescriptor.e();
            int i10 = this.f85767b;
            this.f85767b = i10 - 1;
            return serialDescriptor.f(iE - i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f85767b > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: compiled from: Iterables.kt */
    public static final class c implements Iterable<SerialDescriptor>, un.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SerialDescriptor f85769b;

        public c(SerialDescriptor serialDescriptor) {
            this.f85769b = serialDescriptor;
        }

        @Override // java.lang.Iterable
        public Iterator<SerialDescriptor> iterator() {
            return new a(this.f85769b);
        }
    }

    /* JADX INFO: compiled from: Iterables.kt */
    public static final class d implements Iterable<String>, un.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SerialDescriptor f85770b;

        public d(SerialDescriptor serialDescriptor) {
            this.f85770b = serialDescriptor;
        }

        @Override // java.lang.Iterable
        public Iterator<String> iterator() {
            return new b(this.f85770b);
        }
    }

    @NotNull
    public static final Iterable<SerialDescriptor> a(@NotNull SerialDescriptor serialDescriptor) {
        p.k(serialDescriptor, "<this>");
        return new c(serialDescriptor);
    }

    @NotNull
    public static final Iterable<String> b(@NotNull SerialDescriptor serialDescriptor) {
        p.k(serialDescriptor, "<this>");
        return new d(serialDescriptor);
    }
}
