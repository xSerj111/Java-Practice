class Badge {
    public String print(Integer id, String name, String department) {
        String badgeId = "[" + id + "]" + " - ";
        if (id == null) badgeId = "";
        if (department == null) department = "OWNER";
        return badgeId + name + " - " + department.toUpperCase();
    } 
}
