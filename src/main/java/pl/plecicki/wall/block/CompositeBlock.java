package pl.plecicki.wall.block;

import java.util.List;

public interface CompositeBlock extends Block {
    List<Block> getBlocks();
}
