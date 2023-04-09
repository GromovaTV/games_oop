package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BishopBlackTest {

    @Test
    void whenPositionIsA8() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A8);
        assertThat(bishopBlack.position(), is(Cell.A8));
    }

    @Test
    void way() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] array = bishopBlack.way(Cell.G5);
        assertArrayEquals(new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5}, array);
    }

    @Test
    void whenA1B2isDiagonal() {
        assertTrue(BishopBlack.isDiagonal(Cell.C1, Cell.G5));
    }

    @Test
    void whenCopyA8toC6() {
        BishopBlack bishop = new BishopBlack(Cell.A8);
        assertThat(bishop.copy(Cell.C6).position(), is(Cell.C6));
    }
}