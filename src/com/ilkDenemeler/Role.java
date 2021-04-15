package com.ilkDenemeler;

public enum Role {
    Ogretmen(1, "Öğretmen"),
    Ogrenci(2, "Öğrenci"),
    Mudur(3, "Müdür"),
    MudurYrd(4, "Müdür Yardımcısı"),
    Temizlikci(5, "Temizlik Görevlisi"),
    Guvenlik(6, "Güvenlik Görevlisi"),
    Mezun(7,"Mezun"),
    Silindi(8,"İlişiği kesildi.");

    private int roleID;
    private String role;


    Role( int roleID,String role) {
        this.role = role;
        this.roleID = roleID;
    }

    public int getRoleID() {
        return roleID;
    }

    public String getRole() {
        return role;
    }

    public void setRoleID(int roleID) {
        this.roleID = roleID;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
