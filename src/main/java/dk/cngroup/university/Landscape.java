package dk.cngroup.university;


import java.util.List;

public class Landscape {
	private Field[][] fields;

	public Landscape(int size, List<Position> inaccessiblePositions) {
		fields = new Field[6][6];
		initAccessibleLandscape(size);
		insertInaccessibleFields(inaccessiblePositions);
	}


	@Override
	public String toString() {
		String output = "";
		for (Field[] row : fields) {
			for (Field field : row) {
				output += field.toString();
			}
			output += "\n";
		}
		return output;


	}
	private void insertInaccessibleFields(List<Position> inaccessiblePositions) {
		for (Position p : inaccessiblePositions) {
			fields[p.x][p.y] = Field.INACCESSIBLE;
		}
	}


	private void initAccessibleLandscape(int size) {
		this.fields = new Field[size][size];
		for (int i = 0; i < fields.length; i++){
			for (int j = 0; j < fields[i].length; j++){
				fields[i][j] = Field.ACCESSIBLE;
			}

		}

	}

	public boolean isAccessible(Position position){

		if(fields[position.x][position.y] == Field.ACCESSIBLE){
			return true;
		}
		else{
			return false;
		}

	}


}



