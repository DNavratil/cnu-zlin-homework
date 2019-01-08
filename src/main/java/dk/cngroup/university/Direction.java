package dk.cngroup.university;

public enum Direction {
	NORTH {
		@Override
		Direction getDirectionOnRight() {
			return EAST;
		}

		@Override
		Direction getDirectionOnLeft() {
			return WEST;
		}

		@Override
		Direction getDirectionBack() {
			return SOUTH;
		}
	},

	SOUTH {
		@Override
		Direction getDirectionOnRight() {
			return WEST;
		}

		@Override
		Direction getDirectionOnLeft() {
			return EAST;
		}

		@Override
		Direction getDirectionBack() {
			return NORTH;
		}
	},

	WEST {
		@Override
		Direction getDirectionOnRight() {
			return NORTH;
		}

		@Override
		Direction getDirectionOnLeft() {
			return SOUTH;
		}

		@Override
		Direction getDirectionBack() {
			return EAST;
		}
	},

	EAST {
		@Override
		Direction getDirectionOnRight() {
			return SOUTH;
		}

		@Override
		Direction getDirectionOnLeft() {
			return NORTH;
		}

		@Override
		Direction getDirectionBack() {
			return WEST;
		}
	};

	abstract Direction getDirectionOnRight();
	abstract Direction getDirectionOnLeft();
	abstract Direction getDirectionBack();
}
