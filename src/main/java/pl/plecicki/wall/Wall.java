package pl.plecicki.wall;

import pl.plecicki.wall.block.Block;

import java.util.List;
import java.util.Optional;

public class Wall implements Structure{
    private List<Block> blocks;

    @Override
    public Optional<Block> findBlockByColor(String color) {
        return blocks.stream()
                .filter(block -> block.getColor() != null)
                .filter(block -> block.getColor().equals(color))
                .findFirst();
    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {
        return blocks.stream()
                .filter(block -> block.getMaterial() != null)
                .filter(block -> block.getMaterial().equals(material))
                .toList();
    }

    @Override
    public int count() {
        return blocks == null ? 0 : blocks.size();
    }
}
