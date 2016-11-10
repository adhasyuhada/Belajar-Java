class PackageInfo{

	public static void main(String[] args) {
	Package p = Package.getPackage("java.lang");

	System.out.println("package name "+ p.getName());
	System.out.println("Specification title "+ p.getSpecificationTitle());
	System.out.println("Specification Vendor" + p.getSpecificationVendor());
	System.out.println("Specification Version" + p.getSpecificationVersion());

	System.out.println("Specification Version" + p.getImplementationTitle());
	System.out.println("Specification Version" + p.getImplementationVendor());
	System.out.println("Specification Version" + p.getImplementationVersion());
	System.out.println("Is sealed " + p.isSealed());
	}
}