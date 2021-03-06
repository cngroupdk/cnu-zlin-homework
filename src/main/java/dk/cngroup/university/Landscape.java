package dk.cngroup.university;

import java.util.Arrays;
import java.util.List;

public class Landscape {
	private Field[][] fields;

	public Landscape(int size, List<Position> inaccessiblePositions) {
		initAccessibleLandscape(size);
		insertInaccessibleFields(inaccessiblePositions);
	}

	public boolean isAccessible(Position position){
		return true; // TODO implement
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
}
