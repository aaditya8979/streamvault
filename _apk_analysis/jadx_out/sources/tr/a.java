package tr;

import java.lang.reflect.Field;

/* JADX INFO: compiled from: FieldStateVariableAccessor.java */
/* JADX INFO: loaded from: classes12.dex */
public class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Field f85391a;

    public a(Field field) {
        this.f85391a = field;
    }

    @Override // tr.c
    public Class<?> a() {
        return d().getType();
    }

    @Override // tr.c
    public Object b(Object obj) throws Exception {
        return os.d.b(this.f85391a, obj);
    }

    public Field d() {
        return this.f85391a;
    }

    @Override // tr.c
    public String toString() {
        return super.toString() + " Field: " + d();
    }
}
