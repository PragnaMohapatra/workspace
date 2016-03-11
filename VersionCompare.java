package com.amazon.interview1;

public class VersionCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(compareVersion("1.0", "1.1"));
	}

	public static int compareVersion(String version1, String version2) {

		if (version1 == null || version2 == null) {
			return 0;
		}

		if (version1.equalsIgnoreCase(version2)) {
			return 0;
		}
		String[] v1 = new String[3];
		String[] v2 = new String[3];
		if (version1.indexOf('.') != -1) {
			v1 = version1.replace(".", "~").split("~");
		} else {
			v1[0] = version1;
			v1[1] = "0";
		}
		if (version2.indexOf('.') != -1) {
			v2 = version2.replace(".", "~").split("~");
		} else {
			v2[0] = version2;
			v2[1] = "0";
		}

		if (Integer.parseInt(v1[0]) > Integer.parseInt(v2[0])) {
			return 1;
		} else if (Integer.parseInt(v1[0]) == Integer.parseInt(v2[0])) {
			if (Integer.parseInt(v1[1])>Integer.parseInt(v2[1])) {
				return 1;
			} else if (Integer.parseInt(v1[1])<Integer.parseInt(v2[1])){
				return -1;
			} else{
				return 0;
			}

		} else {
			return -1;
		}
	}
}